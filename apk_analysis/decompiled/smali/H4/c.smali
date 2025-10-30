.class public final LH4/c;
.super LC4/j;
.source "SourceFile"


# static fields
.field public static final k:LA1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LC4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LH4/b;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v2}, LH4/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, LA1/g;

    .line 13
    .line 14
    const-string v3, "ClientTelemetry.API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, LA1/g;-><init>(Ljava/lang/String;LZ0/a;LC4/d;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, LH4/c;->k:LA1/g;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public final d(LF4/m;)Lf5/q;
    .locals 4

    .line 1
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v1, v1, [LB4/d;

    .line 7
    .line 8
    sget-object v2, LT4/b;->a:LB4/d;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    iput-object v1, v0, LD4/n;->b:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean v3, v0, LD4/n;->c:Z

    .line 16
    .line 17
    new-instance v1, Ls4/i;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Ls4/i;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, LD4/n;->e:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0}, LD4/n;->f()LD4/n;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-virtual {p0, v0, p1}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
