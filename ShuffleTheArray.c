int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int *arr=(int*)malloc(2*numsSize*sizeof(int));
    *returnSize=numsSize;
    int j=0,k=1;
    for(int i=0;i<n;i++){
        arr[j]=nums[i];
        j+=2;
    }
    for(int i=n;i<2*n;i++){
        arr[k]=nums[i];
        k+=2;
    }
    return arr;
    free(arr);
}
