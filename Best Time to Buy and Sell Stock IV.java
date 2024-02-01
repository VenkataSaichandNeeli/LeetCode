class Solution {
public:
    int maxProfit(int k, vector<int>& prices) {
        //costs[i] would basically simulate the net cost at ith transaction till a given price index
		// profits[i] would calculate the total profit accumulated after i transactions till a given price index
        vector<int> costs(k+1, INT_MAX);
        vector<int> profits(k+1, 0);
        
        costs[0] = 0;
        
        for(int i = 0; i < prices.size(); i++)
        {
            
            for(int j = 1; j <= k; j++)
            {
                costs[j] = min(costs[j], prices[i]-profits[j-1]);
                
                profits[j] = max(profits[j], prices[i]-costs[j]);
                
            }
        }
        return profits.back();
    }
};
