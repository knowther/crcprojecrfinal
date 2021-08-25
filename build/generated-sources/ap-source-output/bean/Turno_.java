package bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Turno.class)
public abstract class Turno_ {

	public static volatile ListAttribute<Turno, Paciente> pacientes;
	public static volatile SingularAttribute<Turno, String> nome;
	public static volatile SingularAttribute<Turno, Integer> idturno;
	public static volatile SingularAttribute<Turno, Dia> dia;

}

