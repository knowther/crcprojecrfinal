package bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Dia.class)
public abstract class Dia_ {

	public static volatile SingularAttribute<Dia, Integer> iddia;
	public static volatile ListAttribute<Dia, Paciente> pacientes;
	public static volatile SingularAttribute<Dia, String> nome;
	public static volatile ListAttribute<Dia, Turno> turno;

}

