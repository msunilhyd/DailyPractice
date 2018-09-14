#include<iostream>
using namespace std;

int IndexAtWhichSortedArrayIsRotated(int *p, int start, int end){
    if(start < end){
        int mid = (start+end)/2;

        if(p[start] < p[mid]){
            return IndexAtWhichSortedArrayIsRotated(p, mid, end);
        }
        else{
            return IndexAtWhichSortedArrayIsRotated(p, start, mid);
        }
    }
    else if(start == end){
        return start+1;
    }
}

int main(){
    int arr[] = {8,10,17,52,55,3,5,6};
    int len = sizeof(arr)/sizeof(arr[0]);

    int index = IndexAtWhichSortedArrayIsRotated(arr, 0, len-1);

    cout << index << endl;
}