package bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Medico.class)
public abstract class Medico_ {

	public static volatile ListAttribute<Medico, Paciente> pacientes;
	public static volatile SingularAttribute<Medico, String> nome;
	public static volatile SingularAttribute<Medico, Integer> idmedico;
	public static volatile SingularAttribute<Medico, String> crm;

}

