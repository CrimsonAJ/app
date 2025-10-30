.class public final Ly4/r;
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
    const/16 v2, 0x8

    .line 9
    .line 10
    invoke-direct {v1, v2}, LH4/b;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, LA1/g;

    .line 14
    .line 15
    const-string v3, "CastApi.API"

    .line 16
    .line 17
    invoke-direct {v2, v3, v1, v0}, LA1/g;-><init>(Ljava/lang/String;LZ0/a;LC4/d;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, Ly4/r;->k:LA1/g;

    .line 21
    .line 22
    return-void
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
.method public final d([Ljava/lang/String;)Lf5/q;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    new-instance v2, Lcom/google/firebase/messaging/u;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, v2, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v2, v1, LD4/n;->e:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    new-array p1, p1, [LB4/d;

    .line 17
    .line 18
    sget-object v2, Lt4/v;->b:LB4/d;

    .line 19
    .line 20
    aput-object v2, p1, v0

    .line 21
    .line 22
    iput-object p1, v1, LD4/n;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iput-boolean v0, v1, LD4/n;->c:Z

    .line 25
    .line 26
    const/16 p1, 0x20e9

    .line 27
    .line 28
    iput p1, v1, LD4/n;->d:I

    .line 29
    .line 30
    invoke-virtual {v1}, LD4/n;->f()LD4/n;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, v0, p1}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method
