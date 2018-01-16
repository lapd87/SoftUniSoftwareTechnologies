namespace LogNoziroh.Controllers
{
    using System.Collections.Generic;
    using System.Linq;
    using System.Web.Mvc;
    using Models;

    [ValidateInput(false)]
    public class ReportController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            //TODO: Implement me ...

            using (var context = new LogNozirohDbContext())
            {
                List<Report> reports = context.Reports.ToList();

                return View(reports);
            }
        }

        [HttpGet]
        [Route("details/{id}")]
        public ActionResult Details(int id)
        {
            //TODO: Implement me ...

            using (var context = new LogNozirohDbContext())
            {
                Report reportFromDb = context.Reports.Find(id);

                return View(reportFromDb);
            }
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            //TODO: Implement me ...
            return View();

            
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Report report)
        {
            //TODO: Implement me ...

            using (var context = new LogNozirohDbContext())
            {
                context.Reports.Add(report);
                context.SaveChanges();

                return this.Redirect("/");
            }
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int? id)
        {
            //TODO: Implement me ...
            using (var context = new LogNozirohDbContext())
            {
                var report = context.Reports.Find(id);
                if (report == null)
                    return HttpNotFound();

                return View(report);
            }
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int? id)
        {
            //TODO: Implement me ...

            using (var context = new LogNozirohDbContext())
            {
                var reportFromDb = context.Reports.Find(id);
                if (reportFromDb == null)
                    return HttpNotFound();

                context.Reports.Remove(reportFromDb);
                context.SaveChanges();

                return Redirect("/");
            }
        }
    }
}