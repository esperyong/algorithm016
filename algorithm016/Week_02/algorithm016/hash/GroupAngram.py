import collections

def groupAnagrams(strs):
    aps = collections.defaultdict(list)
    for s in strs:
        aps[tuple(sorted(s))].append(s)
    return aps.values()

