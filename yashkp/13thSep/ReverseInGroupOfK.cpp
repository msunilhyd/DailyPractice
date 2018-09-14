#include<iostream>
using namespace std;

void swap( int *p, int *q){
    int temp = *p;
    *p = *q;
    *q = temp;
}

void ReverseinGroupsOfK(int *p, int len, int k){
    int num_loops = len/k;
    int i = 0;
    while(i < num_loops){
        for(int j=0; j<k/2; j++){
            swap(&p[(k*i)+j], &p[(k*i)+k-j-1]);
        }
        i++;
    }
    for(int j=0; j<((len-(k*num_loops))/2); j++){
        swap(&p[(k*num_loops)+j], &p[len-j-1]);
    }
}


void printArray(int *p, int length){
    for(int i=0; i<length; i++){
        cout << p[i] << " ";
    }
    cout << endl;
}

int main(){
    int arr[] = {3,8,2,5,9,1,6,4};
    int k = 3;
    int len = sizeof(arr)/sizeof(arr[0]);

    printArray(arr, len);

    ReverseinGroupsOfK(arr, len, k);

    printArray(arr, len);
}