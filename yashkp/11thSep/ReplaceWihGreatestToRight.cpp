#include<iostream>
using namespace std;

void ReplaceWithGreatestToRight(int *p, int len){
    int greatestTillNow = p[len-1];
    for(int i=len-2; i>=0; i--){
        int temp = p[i];
        p[i] = greatestTillNow;
        if(temp > greatestTillNow){
            greatestTillNow = temp;
        }
    }
}

void printArray(int *p, int len){
    for(int i=0; i<len; i++){
        cout << p[i] << " ";
    }
    cout << endl;
}

int main(){
    int arr[] = {3,10,4,9,1,5,8,2};
    int length = sizeof(arr)/sizeof(arr[0]);

    printArray(arr, length);

    ReplaceWithGreatestToRight(arr, length);

    printArray(arr, length);
    // for(int x : arr){
    //     cout << x << " ";
    // }
}