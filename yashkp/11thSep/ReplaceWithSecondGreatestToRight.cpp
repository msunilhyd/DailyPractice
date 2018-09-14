#include<iostream>
using namespace std;

void ReplaceWithSecondGreatestToRight(int *p, int len){
    int max, max_2;
    if(p[len-1] > p[len-2]){
        max = p[len-1];
        max_2 = p[len-2];
    }
    else{
        max = p[len-2];
        max_2 = p[len-1];
    }
    for(int i=len-3; i>=0; i--){
        if(p[i] > max){
            int temp = max_2;
            max_2 = max;
            max = p[i];
            p[i] = temp;
        }
        else if(p[i] > max_2){
            int temp = max_2;
            max_2 = p[i];
            p[i] = temp;
        }
        else{
            p[i] = max_2;
        }
    }
}

void printArray(int *p, int length){
    for(int i=0; i<length; i++){
        cout << p[i] << " ";
    }
    cout << endl;
}

int main(){
    int arr[] = {3,10,4,9,1,5,8,2};
    int length = sizeof(arr)/sizeof(arr[0]);

    printArray(arr, length);

    ReplaceWithSecondGreatestToRight(arr, length);

    printArray(arr, length);
}