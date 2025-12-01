class Solution(object):
    def mostPopularCreator(self, creators, ids, views):
        total = {}
        best = {}

        for c, vid, v in zip(creators, ids, views):
            total[c] = total.get(c, 0) + v

            if c not in best:
                best[c] = (v, vid)
            else:
                mv, mid = best[c]
                if v > mv or (v == mv and vid < mid):
                    best[c] = (v, vid)

        mx = max(total.values())

        return [[c, best[c][1]] for c in total if total[c] == mx]
