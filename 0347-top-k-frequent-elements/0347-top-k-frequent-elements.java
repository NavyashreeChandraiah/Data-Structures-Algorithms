class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        List<Integer> res = new ArrayList<>();
        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int frequency = entry.getValue();
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(entry.getKey());
        }

        for(int i = bucket.length -1 ; i>=0 && res.size() < k; i--){
           if(bucket[i] != null) {
            res.addAll(bucket[i]);
           }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}