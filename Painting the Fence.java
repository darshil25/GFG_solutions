long mod = 1000000007;

        // Base cases
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return (long) k * k;
        }

        // Initialize same and diff arrays
        long[] same = new long[n + 1];
        long[] diff = new long[n + 1];

        // Initialize for the first two posts
        same[2] = k;
        diff[2] = (long) k * (k - 1);

        // Calculate ways for each post
        for (int i = 3; i <= n; i++) {
            same[i] = diff[i - 1];
            diff[i] = (same[i - 1] + diff[i - 1]) * (k - 1) % mod;
        }

        // Return the total ways
        return (same[n] + diff[n]) % mod;
    }
