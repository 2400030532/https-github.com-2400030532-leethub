class ProductOfNumbers {
   List<Integer>l=new ArrayList<>();
   int x=0;
    public ProductOfNumbers() {
       this.l.add(1);
       this.x=0;
    }
    
    public void add(int num) {
        if(num==0){
            this.l=new ArrayList<>();
            this.l.add(1);
            this.x=0;
        }else{
            this.l.add(this.l.get(x)*num);
            this.x++;
        }
    }
    
    public int getProduct(int k) {
        if(k>this.x){
            return 0;
        }else{
            return (this.l.get(this.x)/this.l.get(this.x-k));
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */