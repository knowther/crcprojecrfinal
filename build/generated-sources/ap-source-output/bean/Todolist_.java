package bean;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Todolist.class)
public abstract class Todolist_ {

	public static volatile SingularAttribute<Todolist, Date> date;
	public static volatile SingularAttribute<Todolist, Integer> idtodolist;
	public static volatile SingularAttribute<Todolist, Paciente> paciente;
	public static volatile SingularAttribute<Todolist, Integer> tipostodolistIdtipostodolist;
	public static volatile SingularAttribute<Todolist, Short> feito;

}

