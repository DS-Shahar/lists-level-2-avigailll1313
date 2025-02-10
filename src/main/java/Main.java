class Main {
 	public static Node <Integer> q1(Node <Integer> h1, Node <Integer> h2)
	{
		Node <Integer> head1 = h1;
		Node <Integer> head2 = h2;
		
		Node <Integer> a1 = new Node <>(null); 
		Node <Integer> a2 = a1; 
		Node <Integer> a3 ;
		
		while (head1 != null && head2 != null)
		{
			if (head1.getValue() >= head2.getValue())
			{
				a3 = new Node <>(head2.getValue());
				head2 = head2.getNext();
			}
			else
			{
				a3 = new Node <>(head1.getValue());
				head1 = head1.getNext();
			}
			a2.setNext(a3);
			a2 = a3;
			
		}
		
		if (head1 != null)
		{
			while (head1 != null)
			{
				a3 = new Node <> (head1.getValue());
				a2.setNext(a3);
				a2 = a3;
				head1 =head1.getNext();
			}
		}
		
		if (head2 != null)
		{
			while (head2 != null)
			{
				a3 = new Node <> (head2.getValue());
				a2.setNext(a3);
				a2 = a3;
				head2 = head2.getNext();
			}
		}
		
		return a1.getNext();
	}
	
	public static Node <Integer> q2(Node <Integer> header)
	{
		Node <Integer> utility = new Node <> (null, header);
		Node <Integer> c ;
		Node <Integer> current ;
		int min;
		
		Node <Integer> a1 = new Node <>(null); 
		Node <Integer> a2 = a1; 
		Node <Integer> a3 ;
		
		
		
		while (utility.getNext() != null)
		{
			min = utility.getNext().getValue();
			c = utility.getNext().getNext();
			while (c != null)
			{
				if (min > c.getValue())
				{
					min = c.getValue();
				}
				c = c.getNext();
			}
			
			current = utility;
	        while (current.getNext() != null) 
	        {
	            if (current.getNext().getValue() == min) 
	            {
	                current.setNext(current.getNext().getNext());
	                break;
	            } 
	            else 
	            {
	                current = current.getNext();
	            }
	        }
			a3 = new Node <> (min);
			a2.setNext(a3);
			a2 = a3;
			
		}
		
		return a1.getNext();
	}

	public static int q3(Node <Integer> header, int num)
	{
		Node <Integer> current = header;
		
		int firstAppearance = -1;
		int lastAppearance = -1;
		int index = 0;
		
		while (current != null)
		{
			if (current.getValue() == num)
			{
				if (firstAppearance == -1)
				{
					firstAppearance = index ;
				}
				lastAppearance = index;
			}
			current = current.getNext();
			index ++;
			
		}
		if (firstAppearance == -1)
		{
			return -1;
		}
		
		int len = index;
		int distanceFromStart = firstAppearance;
		int distanceFromEnd = len- 1 - lastAppearance;
		
		int sum = distanceFromStart + distanceFromEnd ;
		
		return sum;
	}
	
	public static boolean q4(Node <Integer> header)
	{
		Node <Integer> current = header ;
		Node <Integer> check ;
		
		while (current != null)
		{
			check = current.getNext();
			while (check != null) 
			{
                if (current.getValue() == check.getValue()) {
                    return false; 
                }
                check = check.getNext();
            }
            current = current.getNext();
		}
		return true;
	}
	
	public static Node <Integer> q5(Node <Integer> header)
	{
		Node <Integer> current = header;
		Node <Integer> check ;
		
		Node <Integer> a1 = new Node <>(null); 
		Node <Integer> a2 = a1; 
		Node <Integer> a3 ;
		
		boolean flag ;
		
		while(current != null)
		{
			check = a1.getNext();
			flag = false;
			while (check != null) 
			{
                if (current.getValue() == check.getValue()) {
                	flag = true;
                	break ;
                }
                check = check.getNext();
            }
			if (flag == false) 
			{
				a3 = new Node <> (current.getValue()); 
				a2.setNext(a3);
				a2 = a3;
	        }
            current = current.getNext();
		}
		
		return a1.getNext();
	}


	public static Node <Integer> q6(Node <Integer> header)
	{
		Node <Integer> current = header;
		Node <Integer> check ;
		int flag=1;
		int max=0;
		
		while(current != null)
                if (current.Next().getValue() >= current.getValue()) {
                	flag =+1 ;
                }
               
            current = current.getNext();
		}
		
		return header;
	}

	public static Node <Integer> q7(Node <Integer> header)
	{
		Node <Integer> current = header;
		Node <Integer> check ;
		int flag=1;
		int max=0;
		
		while(current != null)
                if (current.Next().getValue() >= current.getValue()) {
                	flag =+1 ;
                }
               
            current = current.getNext();
		}
		
		return header;
	}
}
