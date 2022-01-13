class Stack {
    
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = 9;
    }
    void push(int item) {
        if(tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }
    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
    public static void main(String[] args) {
        Stack instance = new Stack();
        int x = 89;
        instance.push(x);
        instance.pop();
    } 
    
}