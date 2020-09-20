
class PostNtree {

    public List<Integer> postorder(Node root) {
        list = new ArrayList<>() ;
        order(root) ;
        return list ;
    }

    public void order(Node root) {
        if(root == null)
        {
            return ;
        }
        for(Node child: root.children)
        {
            order(child) ;
        }
        
        list.add(root.val) ;
    }

}
