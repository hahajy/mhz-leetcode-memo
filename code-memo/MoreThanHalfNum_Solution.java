public class MoreThanHalfNum_Solution{
	//返回数组中出现超过1/2的数
	//分析：数组中出现超过1/2的数最多有一个
	public int MoreThanHalfNum(int [] array){
		if(array.length==0)
			return 0;
		int num;
		int count=0;
		//当前数与记录数据相同，count++，否则判断count是否是0，肯定则记录当前数，count=1；否则count--
		for(int i=0;i<array.length;i++){
			if(count==0){
				count++;
				num=array[i];
			}
			else{
				if(array[i]==num)
					count++;
				else
					count--;
			}			
		}
		//最终记录的num中的数最有可能出现次数大于1/2，遍历判断
		count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==num){
				count++;
			}
		}
		if(count>0.5*array.length)
			return num;
		return 0;		
	}
	public ArrayList<Integer> MoreThanXhalfNum(int[] array,int x){
		//返回数组中出现超过1/x的数
		//分析：数组中出现超过1/x的数最多x-1个
		if(array.length==0||x<1)
			return 0;
		if(x==1){
			for(int i=1;i<array.length;i++){
				if(array[0]!=array[i])
					return 0;
			}
			return array[0];
		}
		int[] num=new int[x-1];
		int[] count=new int[x-1];
		for(int i=1;i<array.length;i++){
			bool flag=false;
			for(int j=0;j<x;j++){
				if(count[j]==0||array[i])==num[j]){
					num[j]=array[i];
					count[j]++;
					flag=true;
					break;
				}
			}
			if(!flag)//不存在相同的数据
			{
				for(int j=0;j<x;j++){
					count[j]--;
				}	
			}
		}
		return MoreThanPNum(array,num,1/x*array.length);
			
	}
	public ArrayList<Integer> MoreThanPNum(int []array,int[] num,double p){
		//返回num中在array中出现次数多于p的数列
		//统计并判断即可
		......
	}
}