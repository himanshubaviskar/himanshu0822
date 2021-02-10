package in.co.sunrays.project0.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.sunrays.project0.dto.MarksheetDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class MarksheetDAOHibImpl.
 */
@Repository(value="marksheetDAO")
public class MarksheetDAOHibImpl implements MarksheetDAOInt {

	/** The sessionfactory. */
	@Autowired
	private SessionFactory sessionfactory = null;

	/** The log. */
	private static Logger log = Logger.getLogger(MarksheetDAOHibImpl.class);
	
	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#add(in.co.sunrays.project0.dto.MarksheetDTO)
	 */
	public long add(MarksheetDTO dto) {
		log.debug("Marksheet Dao Add Started");
		log.debug("Marksheet Dao Add End");
		return (Long) sessionfactory.getCurrentSession().save(dto);
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#update(in.co.sunrays.project0.dto.MarksheetDTO)
	 */
	public void update(MarksheetDTO dto) {
		log.debug("Marksheet Dao update Started");
		sessionfactory.getCurrentSession().update(dto);
		log.debug("Marksheet Dao update End");
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#delete(long)
	 */
	public void delete(long id) {
		log.debug("Marksheet Dao delete Started");
		MarksheetDTO dto=findByPK(id);
		sessionfactory.getCurrentSession().delete(dto);
		log.debug("Marksheet Dao delete End");
		
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#findByRollNo(java.lang.String)
	 */
	public MarksheetDTO findByRollNo(String rollNo) {
		log.debug("Marksheet Dao findByRollNo Started");
		MarksheetDTO dto = null;
		List list =sessionfactory.getCurrentSession().createCriteria(MarksheetDTO.class).add(Restrictions.eq("rollNo", rollNo)).list();
		if (list.size() == 1) {
			dto = (MarksheetDTO) list.get(0);
		}
		log.debug("Marksheet Dao findByRollNo End");
		return dto;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#findByPK(long)
	 */
	public MarksheetDTO findByPK(long pk) {
		log.debug("Marksheet Dao findByPK Started");
		MarksheetDTO dto = (MarksheetDTO) sessionfactory.getCurrentSession().get(MarksheetDTO.class, pk);
		log.debug("Marksheet Dao findByPK End");
		return dto;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#search(in.co.sunrays.project0.dto.MarksheetDTO)
	 */
	public List search(MarksheetDTO dto) {
		return search(dto, 0, 0);
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#search(in.co.sunrays.project0.dto.MarksheetDTO, int, int)
	 */
	public List search(MarksheetDTO dto, int pageNo, int pageSize) {
		log.debug("Marksheet Dao search Started");
		Criteria criteria= sessionfactory.getCurrentSession().createCriteria(MarksheetDTO.class);
		
		if(dto!=null)
		{
		
		
		if (dto.getId() > 0) {
            criteria.add(Restrictions.eq("id", dto.getId()));
        }
        if (dto.getRollNo() != null && dto.getRollNo().length() > 0) {
            criteria.add(Restrictions.eq("rollNo", dto.getRollNo()));
        }
        if (dto.getName() != null && dto.getName().length() > 0) {
            criteria.add(Restrictions.like("name", dto.getName() + "%"));
        }
        if (dto.getPhysics() != null && dto.getPhysics() > 0) {
            criteria.add(Restrictions.eq("physics", dto.getPhysics()));
        }
        if (dto.getChemistry() != null && dto.getChemistry() > 0) {
            criteria.add(Restrictions.eq("chemistry", dto.getChemistry()));
        }
        if (dto.getMaths() != null && dto.getMaths() > 0) {
            criteria.add(Restrictions.eq("maths", dto.getMaths()));
        }

		}
        // if page size is greater than zero the apply pagination
        if (pageSize > 0) {
            criteria.setFirstResult(((pageNo - 1) * pageSize));
            criteria.setMaxResults(pageSize);
        }		
		log.debug("Marksheet Dao search End");
		return criteria.list();
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.MarksheetDAOInt#getMeritList(int, int)
	 */
	public List getMeritList(int pageNo, int pageSize) {
		log.debug("Marksheet Dao getMeritList Started");
		String hql = "from MarksheetDTO where physics>33 and chemistry>33 and maths>33 order by (physics + chemistry + maths) desc";
		

		
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery(hql);
        q.setFirstResult(pageNo);
        q.setMaxResults(10);

		log.debug("Marksheet Dao getMeritList End");
		return q.list();
	}

}
