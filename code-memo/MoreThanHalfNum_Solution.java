public class MoreThanHalfNum_Solution{
	//���������г��ֳ���1/2����
	//�����������г��ֳ���1/2���������һ��
	public int MoreThanHalfNum(int [] array){
		if(array.length==0)
			return 0;
		int num;
		int count=0;
		//��ǰ�����¼������ͬ��count++�������ж�count�Ƿ���0���϶����¼��ǰ����count=1������count--
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
		//���ռ�¼��num�е������п��ܳ��ִ�������1/2�������ж�
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
		//���������г��ֳ���1/x����
		//�����������г��ֳ���1/x�������x-1��
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
			if(!flag)//��������ͬ������
			{
				for(int j=0;j<x;j++){
					count[j]--;
				}	
			}
		}
		return MoreThanPNum(array,num,1/x*array.length);
			
	}
	public ArrayList<Integer> MoreThanPNum(int []array,int[] num,double p){
		//����num����array�г��ִ�������p������
		//ͳ�Ʋ��жϼ���
		......
	}
}