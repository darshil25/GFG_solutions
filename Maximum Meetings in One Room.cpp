struct meet {
        int start, end, index;
    };

    static bool comp(struct meet& a, struct meet& b) {
        if (a.end == b.end)
            return a.start < b.start;

        return a.end < b.end;
    }

    vector<int> maxMeetings(int N, vector<int>& S, vector<int>& F) {
        vector<meet> v;
        vector<int> out;

        for (int i = 0; i < N; ++i)
            v.push_back({S[i], F[i], i + 1});

        sort(v.begin(), v.end(), comp);

        int last = 0;
        for (auto i : v)
            if (last < i.start) {
                last = i.end;
                out.push_back(i.index);
            }

        sort(out.begin(), out.end());
        return out;
    }
