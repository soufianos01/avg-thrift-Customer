namespace java customer
namespace py customer

typedef i32 int

struct Customer {
  1: string vorname,
  2: string nachname,
  3: int worthiness
}

service CustomerService
{
  list<Customer> findAllCustomers(),
  Customer findCustomer(1: string vorname, 2: string nachname),
  bool addCustomer(1: Customer c),
  bool isCreditWorthy(1: Customer c, 2: int Credit)
}