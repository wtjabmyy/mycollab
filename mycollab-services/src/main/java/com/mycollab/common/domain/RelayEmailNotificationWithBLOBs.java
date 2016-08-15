/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.common.domain;

import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class RelayEmailNotificationWithBLOBs extends RelayEmailNotification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.typeId
     *
     * @mbggenerated Sun Aug 14 20:59:43 ICT 2016
     */
    @Length(max=65535, message="Field value is too long")
    @Column("typeId")
    private String typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.changeComment
     *
     * @mbggenerated Sun Aug 14 20:59:43 ICT 2016
     */
    @Length(max=65535, message="Field value is too long")
    @Column("changeComment")
    private String changecomment;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.typeId
     *
     * @return the value of s_relay_email_notification.typeId
     *
     * @mbggenerated Sun Aug 14 20:59:43 ICT 2016
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.typeId
     *
     * @param typeid the value for s_relay_email_notification.typeId
     *
     * @mbggenerated Sun Aug 14 20:59:43 ICT 2016
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.changeComment
     *
     * @return the value of s_relay_email_notification.changeComment
     *
     * @mbggenerated Sun Aug 14 20:59:43 ICT 2016
     */
    public String getChangecomment() {
        return changecomment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.changeComment
     *
     * @param changecomment the value for s_relay_email_notification.changeComment
     *
     * @mbggenerated Sun Aug 14 20:59:43 ICT 2016
     */
    public void setChangecomment(String changecomment) {
        this.changecomment = changecomment;
    }

    public enum Field {
        id,
        saccountid,
        type,
        action,
        changeby,
        extratypeid,
        typeid,
        changecomment;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}