#include<bits/stdc++.h> 
using namespace std;

class Node
{
	public:
		int data;
		Node * next;
} * head = NULL, *temp = NULL, * newnode = NULL;

void insert(Node **head, int data)
{
	newnode = new Node();
	newnode -> data = data;
	newnode -> next = NULL;
	
	if(*head == NULL)
	{
		*head = newnode;
		temp = newnode;
	}
	else
	{
		temp -> next = newnode;
		temp = newnode;
	}
}

void display(Node * head)
{
	while(head != NULL)
	{
		cout << head -> data << " ";
		head = head -> next;
	}
}

int main()
{
	int data;
	do
	{
		cin >> data;
		if(data > 0)
			insert(&head, data);
	}while(data > 0);
	
	display(head);
	
	
}












