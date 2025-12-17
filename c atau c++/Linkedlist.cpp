#include <iostream>
using namespace std;

struct Node {
    int num;
    Node *next;
};
struct Node *head=NULL;

void insertNode (int n) {
    struct Node *newNode=new Node;
    newNode->num=n;
    newNode->next=head;
    head=newNode;

    printf("Insert %d, DATA menjadi >> [ ",n);
}
void display () {
    if (head==NULL) {
            printf(">> List is empty ! \n");
            return;
    }
    struct Node *temp=head;

    while(temp!=NULL) {
        cout<<temp->num<<" ";
        temp=temp->next;
    }
    printf("]");
    cout<<endl;
}
void deleteItem() {
    if(head==NULL) {
        printf(">> List is empty ! \n");
        return;
    }
    printf(" (%d) Removed, DATA menjad >> [ ", head->num);
    head=head->next;
}