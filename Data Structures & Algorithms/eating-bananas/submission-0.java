class Solution {
    public int minEatingSpeed(int[] piles, int h) {


// ignore
        // sort array & use binary search 

        // target 

        // 4 10 23 25

        // 1 2 3 4

        // 1, 3, 6, 10 || 1, 2, 4, 6

        // hours <= h

        // hours = piles[lp]/piles[rp] + hours 
        // lp++ until lp = 0 again 
        // lp = rp, then rp ++,
        // return smallest rp




  // binary search possible eating speeds, not piles
  // min = 1, max is biggest in pile
  // k  = mid
  // calculate how long k would take, 
  // if k too slow, l=k+1
  // if k works, maybe its faster than we need and we can use a smaller k value so r = k - 1 



       int left=1;
       int right = piles[0];

        for (int pile : piles) {
            right = Math.max(right, pile);
        }


        int answer = right; 

        while(left<=right){
            int k = (left + right)/2;

            long hours = 0;

            for (int p : piles) {
                hours +=  Math.ceil((double) p / k);

            }

            if(hours<=h){
                answer = k;
                right = k - 1;
            }
            else{
                left = k + 1;
            }


        }





        return answer;

        
    }
}
