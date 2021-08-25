package bean;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ocorrencias.class)
public abstract class Ocorrencias_ {

	public static volatile SingularAttribute<Ocorrencias, Integer> idocorrencias;
	public static volatile SingularAttribute<Ocorrencias, Date> dataocorrencia;
	public static volatile SingularAttribute<Ocorrencias, String> transferencia;
	public static volatile SingularAttribute<Ocorrencias, String> textobase;
	public static volatile SingularAttribute<Ocorrencias, String> tx;
	public static volatile SingularAttribute<Ocorrencias, Date> ultimadialise;
	public static volatile SingularAttribute<Ocorrencias, String> abandonoignorado;
	public static volatile SingularAttribute<Ocorrencias, Paciente> paciente;
	public static volatile SingularAttribute<Ocorrencias, String> melhora;
	public static volatile SingularAttribute<Ocorrencias, String> outros;
	public static volatile SingularAttribute<Ocorrencias, String> obito;
	public static volatile SingularAttribute<Ocorrencias, String> cura;

}

