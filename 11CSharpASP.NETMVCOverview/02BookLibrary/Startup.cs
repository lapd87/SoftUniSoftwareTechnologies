using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(_02BookLibrary.Startup))]
namespace _02BookLibrary
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
