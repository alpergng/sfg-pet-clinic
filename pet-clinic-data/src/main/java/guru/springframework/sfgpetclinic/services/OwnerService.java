package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;


/**
 * Created by Ag on 21.7.2019
 */
public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
