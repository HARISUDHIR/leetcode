class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int iMax = 0;
        List<Boolean> L1 = new ArrayList<>();

        for(int i : candies)
        {
            if(i > iMax) iMax = i;
        }

        for(int i: candies)
        {
            if(i + extraCandies >= iMax)
            {
                L1.add(true);
            }
            else
            {
                L1.add(false);
            }
        }
        return L1;
    }
}