package ru.progwards.java1.lessons.arrays2;


public class DIntArray {
    private int[] nums;

    public DIntArray() {
    }

    public void add(int num) {
        int[] numsNew;
        if (nums == null) {
            numsNew = new int[1];
            numsNew[0] = num;
        }
        else {
            numsNew = new int[nums.length + 1];
            System.arraycopy(nums, 0, numsNew, 0, nums.length);
            numsNew[nums.length] = num;
        }
        nums = numsNew;
    }

    public void atInsert(int pos, int num) {
        int[] numsNew;
        if (nums == null) {
            numsNew = new int[1];
            numsNew[0] = num;
        }
        else if (nums.length - 1 < pos) {
            numsNew = new int[nums.length + 1];
            System.arraycopy(nums, 0, numsNew, 0, nums.length);
            numsNew[nums.length] = num;
        } else {
            numsNew = new int[nums.length + 1];
            System.arraycopy(nums, 0, numsNew, 0, pos);
            numsNew[pos] = num;
            System.arraycopy(nums, pos, numsNew, pos + 1, nums.length - pos);
        }
        nums = numsNew;
    }

    public void atDelete(int pos) {
        int[] numsNew = new int[nums.length - 1];
        if (nums.length - 1 < pos) {
            System.arraycopy(nums, 0, numsNew, 0, nums.length - 1);
        } else {
            System.arraycopy(nums, 0, numsNew, 0, pos);
            System.arraycopy(nums, pos + 1, numsNew, pos, nums.length - pos - 1);
        }
        nums = numsNew;
    }

    public int at(int pos) {
        if (nums.length - 1 < pos) {
            return Integer.MIN_VALUE;
        }
        return nums[pos];
    }}
