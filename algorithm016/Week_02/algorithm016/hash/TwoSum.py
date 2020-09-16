class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        m = {}
        i = 0
        for num in nums:
            m[num] = i
            i = i + 1

        j = 0
        for num in nums:
            c = target - num
            if m.has_key(c) and m.get(c) != j:
                return [m.get(c), j]
            j = j + 1
