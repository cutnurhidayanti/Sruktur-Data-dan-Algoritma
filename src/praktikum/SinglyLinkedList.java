package praktikum;

public class SinglyLinkedList {
    protected Node first;
    protected Node last;
    public int size;
    
    /* Constructor */
    public SinglyLinkedList()
    {
        first = null;
        last = null;
        size = 0;
    }
    
    //method untuk mengecek apakah linked list kosong atau tidak
    public boolean isEmpty()
    {
        return first == null;
    }
    
    //method untuk mengembalikan ukuran linked list sekarang
    public int getSize()
    {
        return size;
    }
    
    //method untuk memasukkan node di awal linked list
    public void insertAwal(int val)
    {
        //buat satu node baru
        Node nptr = new Node(val, null);
        
        if(first == null) //jika linked list masih kosong
        {
            first = nptr;
            last = first;
        }
        else
        {
            nptr.setLink(first);
            first = nptr;
        }
        //tambah ukuran linked list
        size++; 
    }
    
    //method untuk memasukkan node di akhir linked list
    public void insertAkhir(int val)
    {
        //buat satu node baru
        Node nptr = new Node(val, null); 
        
        if(first == null) //jika linked list masih kosong
        {
            first = nptr;
            last = first;
        }
        else
        {
            last.setLink(nptr);
            last = nptr;
        }
    
    //tambah ukuran linked list
        size++;
    }
    
    //method untuk memasukkan node di posisi tertentu
    public void insertAtPos(int val, int pos)
    {
        //buat satu node baru
        Node nptr = new Node(val, null);
        
        if(pos > size)
        System.out.println("Posisi melebihi batas linked list");
        else if(pos == 1)
        insertAwal(val);
        else if(pos == size)
        insertAkhir(val);
        else
        {
        Node ptr = first;
        pos = pos - 1;
        
        for(int i=1; i<size; i++)
        {
        if(i == pos) //ketemu posisi
        {
        Node tmp = ptr.getLink();
        ptr.setLink(nptr);
        nptr.setLink(tmp);
        break;
        }
        ptr = ptr.getLink();
        }
        
        //tambah ukuran linked list
        size++;
        }
    }
    
    //method untuk menghapus node di awal linked list
    public void deleteAwal()
    {
        if(size == 1) //jika hanya ada 1 node
        {
        first = null;
        last = null;
        size = 0;
        }
        else
        {
        first = first.getLink();
        first.setLink(null);
        size--;
        }
    }
    
    //method untuk menghapus node di akhir linked list
    public void deleteAkhir()
    {
    Node temp = first;
    for(int i=1; i<size-1; i++)
    temp = temp.getLink();
    
    last = temp;
    last.setLink(null);
    
    size--; //kurangi ukuran linked list
    }
    
    //method untuk menghapus node pada posisi tertentu
    public void deleteAtPos(int pos)
    {
    if(pos > size)
    System.out.println("Posisi node melebihi ukuran");
    else if(pos == 1)
    this.deleteAwal();
    else if(pos == size)
    this.deleteAkhir();
    else
    {
    Node ptr = first;
    pos--;
    
    for(int i=1; i<=pos; i++)
    {
    if(i == pos)
    {
    Node temp = ptr.getLink();
    temp = temp.getLink();
    ptr.setLink(temp);
    break;
    }
    ptr = ptr.getLink();
    }
    size--;
    }
    }
    
    //method untuk menampilkan semua unsur dalam linked list
    public void display()
    {
    Node ptr = first;
    
    while(true)
    {
    if(ptr == null)
    break;
    System.out.print(ptr.getData() + "->");
    ptr = ptr.getLink();
    }
    System.out.println();
    }
    
    public static void main(String[] ar)
    {
    SinglyLinkedList lk = new SinglyLinkedList();
    lk.insertAwal(10);
    lk.insertAwal(20);
    lk.insertAkhir(30);
    lk.insertAwal(40);
    lk.insertAtPos(50, 2);
    lk.insertAkhir(60);
    
    lk.display();
    
    //lk.deleteAwal();
    //lk.deleteAkhir();
    lk.deleteAtPos(2);
    
    lk.display();

        
    }   
}