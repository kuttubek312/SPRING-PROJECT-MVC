package peaksoft.service;
import java.util.List;
import peaksoft.model.Company;

public interface CompanyService {

    Company saveCompany(Company company);

    void removeCompanyById(Long id);

    Company getById(Long id);

    List<Company> getAllCompany();

    void update(Long id, Company company);
}
