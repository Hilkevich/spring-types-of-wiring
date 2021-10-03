package koschei.models;


//@Component                        // не @Component
public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {    //уже является бином в AppConfig! поэтому нет @Autowired
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
