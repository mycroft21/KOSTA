package text3;

class MaySum {

	int first;
	int second;
	
	
	@Override
	public String toString() {
		return String.valueOf(first + second);
	}

	public MaySum(int first, int second) {
		// TODO Auto-generated constructor stub
		
		this.first = first;
		this.second = second;
	}

	

	@Override
	public boolean equals(Object obj){
		if(obj instanceof MaySum){
			if((this.first+this.second)==(((MaySum) obj).first+((MaySum) obj).second)){
				return true;
			}else {return false;}
			
			
		}
		else {return false;}
	}
	
	

}
