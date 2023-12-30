Stack<Long> stack = new Stack<>();
        long tp = -1, maxArea = 0, currArea = 0, i = 0;

        while (i < n) {
            if (stack.isEmpty() || height[(int) i] >= height[stack.peek().intValue()]) {
                stack.push(i++);
            } else {
                tp = stack.pop();
                currArea = height[(int) tp] * (stack.isEmpty() ? i : i - stack.peek().intValue() - 1);

                if (currArea > maxArea) {
                    maxArea = currArea;
                }
            }
        }

        while (!stack.isEmpty()) {
            tp = stack.pop();
            currArea = height[(int) tp] * (stack.isEmpty() ? i : i - stack.peek().intValue() - 1);

            if (currArea > maxArea) {
                maxArea = currArea;
            }
        }

        return maxArea;
