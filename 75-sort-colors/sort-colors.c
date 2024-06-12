void sortColors(int*p, int n){
    int c=0,d=0;
    for(int i=0;i<n;i++){
        if(p[i]==0){
            ++c;
        }if(p[i]==1){
            ++d;
        }
    }
    for(int i=0;i<n;i++){
        if(i<c){
            p[i]=0;
        }else if(i<c+d&&i>=c){
            p[i]=1;
        }else{
            p[i]=2;
        }
    }
}