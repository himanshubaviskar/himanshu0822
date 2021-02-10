package in.co.sunrays.project0.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.sunrays.project0.dto.CollegeDTO;
import in.co.sunrays.project0.dto.CourseDTO;
import in.co.sunrays.project0.dto.FacultyDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class FacultyDAOHibImpl.
 */
@Repository(value = "facultyDAO")
public class FacultyDAOHibImpl implements FacultyDAOInt {

	/** The sessionfactory. */
	@Autowired
	private SessionFactory sessionfactory = null;
	
	/** The log. */
	private static Logger log = Logger.getLogger(FacultyDAOHibImpl.class);

	/** The college dao. */
	@Autowired
	CollegeDAOInt collegeDao;

	/** The course dao. */
	@Autowired
	CourseDAOInt courseDao;

	/** The subject dao. */
	@Autowired
	SubjectDAOInt subjectDao;

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.FacultyDAOInt#add(in.co.sunrays.project0.dto.FacultyDTO)
	 */
	public long add(FacultyDTO dto) {
		log.debug("FacultyDAO add Started");
		long pk = (Long) sessionfactory.getCurrentSession().save(dto);
		log.debug("FacultyDAO add End");
		return pk;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.FacultyDAOInt#update(in.co.sunrays.project0.dto.FacultyDTO)
	 */
	public void update(FacultyDTO dto) {
		log.debug("FacultyDAO update Started");
		sessionfactory.getCurrentSession().update(dto);
		log.debug("FacultyDAO update End");

	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.FacultyDAOInt#delete(long)
	 */
	public void delete(long id) {
		log.debug("FacultyDAO delete Started");
		FacultyDTO dto = findByPK(id);
		sessionfactory.getCurrentSession().delete(dto);
		log.debug("FacultyDAO delete End");
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.FacultyDAOInt#findByEmail(java.lang.String)
	 */
	public FacultyDTO findByEmail(String email) {
		log.debug("FacultyDAO findByEmail Started");
		FacultyDTO dto = null;
		List list = sessionfactory.getCurrentSession().createCriteria(FacultyDTO.class)
				.add(Restrictions.eq("loginId", email)).list();
		if (list.size() == 1) {
			dto = (FacultyDTO) list.get(0);
		}
		log.debug("FacultyDAO findByEmail End");
		return dto;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.FacultyDAOInt#findByPK(long)
	 */
	public FacultyDTO findByPK(long pk) {
		log.debug("FacultyDAO findByPK Started");
		FacultyDTO dto = (FacultyDTO) sessionfactory.getCurrentSession().get(FacultyDTO.class, pk);
		log.debug("FacultyDAO findByPK End");
		return dto;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.FacultyDAOInt#search(in.co.sunrays.project0.dto.FacultyDTO, int, int)
	 */
	public List search(FacultyDTO dto, int pageNo, int pageSize) {
		log.debug("FacultyDAO search Started");
		List list = null;
		Criteria criteria = sessionfactory.getCurrentSession().createCriteria(FacultyDTO.class);
		
		if(dto!=null)
		{
			
			if (dto.getCourseId()>0 ) {

				criteria.add(Restrictions.eq("courseId", dto.getCourseId()));

			}

		

			if (dto.getCollegeId()>0 ) {

				criteria.add(Restrictions.eq("collegeId", dto.getCollegeId()));

			}
		
		
		}

		// if page size is greater than zero the apply pagination
		if (pageSize > 0) {
			criteria.setFirstResult(((pageNo - 1) * pageSize));
			criteria.setMaxResults(pageSize);
		}
		list = criteria.list();

		log.debug("FacultyDAO search End");
		return list;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dao.FacultyDAOInt#search(in.co.sunrays.project0.dto.FacultyDTO)
	 */
	public List search(FacultyDTO dto) {
		return search(dto, 0, 0);
	}

}
