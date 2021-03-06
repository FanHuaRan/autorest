/*
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

const models = require('./index');

/**
 * The parameters to provide for the account.
 *
 * @extends models['BaseResource']
 */
class StorageAccountCreateParameters extends models['BaseResource'] {
  /**
   * Create a StorageAccountCreateParameters.
   * @member {string} location Resource location
   * @member {object} [tags] Resource tags
   * @member {string} accountType Gets or sets the account type. Possible
   * values include: 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS',
   * 'Standard_RAGRS', 'Premium_LRS'
   */
  constructor() {
    super();
  }

  /**
   * Defines the metadata of StorageAccountCreateParameters
   *
   * @returns {object} metadata of StorageAccountCreateParameters
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'StorageAccountCreateParameters',
      type: {
        name: 'Composite',
        className: 'StorageAccountCreateParameters',
        modelProperties: {
          location: {
            required: true,
            serializedName: 'location',
            type: {
              name: 'String'
            }
          },
          tags: {
            required: false,
            serializedName: 'tags',
            type: {
              name: 'Dictionary',
              value: {
                  required: false,
                  serializedName: 'StringElementType',
                  type: {
                    name: 'String'
                  }
              }
            }
          },
          accountType: {
            required: true,
            serializedName: 'properties.accountType',
            type: {
              name: 'Enum',
              allowedValues: [ 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS' ]
            }
          }
        }
      }
    };
  }
}

module.exports = StorageAccountCreateParameters;
