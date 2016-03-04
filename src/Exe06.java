public class Exe06 {
	public void Impares(){
		int v[] = new int[10];
		int i = 0, c = 0;
		
		do{
            if(i % 2 == 1){
                v[c] = i;
                c++;
            }
            i++;
        }while(c < 10);
        
        for(i = 0; i < v.length; i++)
            System.out.println(i+1 +"o numero impar: " +v[i]);	
	}

}
