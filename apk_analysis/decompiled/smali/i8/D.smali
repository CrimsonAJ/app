.class public final Li8/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:J

.field public B:Li/G;

.field public a:Ll1/g;

.field public b:Li/G;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Lk8/a;

.field public f:Z

.field public g:Li8/b;

.field public h:Z

.field public i:Z

.field public j:Li8/r;

.field public k:Li8/g;

.field public l:Li8/s;

.field public m:Ljava/net/ProxySelector;

.field public n:Li8/r;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Ljavax/net/ssl/HostnameVerifier;

.field public u:Li8/l;

.field public v:Lcom/google/android/gms/internal/measurement/D1;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ll1/g;

    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ll1/g;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Li8/D;->a:Ll1/g;

    .line 12
    .line 13
    new-instance v0, Li/G;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-direct {v0, v1}, Li/G;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Li8/D;->b:Li/G;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Li8/D;->c:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Li8/D;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v0, Lk8/a;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, v1}, Lk8/a;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Li8/D;->e:Lk8/a;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Li8/D;->f:Z

    .line 45
    .line 46
    sget-object v1, Li8/b;->a0:Li8/r;

    .line 47
    .line 48
    iput-object v1, p0, Li8/D;->g:Li8/b;

    .line 49
    .line 50
    iput-boolean v0, p0, Li8/D;->h:Z

    .line 51
    .line 52
    iput-boolean v0, p0, Li8/D;->i:Z

    .line 53
    .line 54
    sget-object v0, Li8/r;->a:Li8/r;

    .line 55
    .line 56
    iput-object v0, p0, Li8/D;->j:Li8/r;

    .line 57
    .line 58
    sget-object v0, Li8/s;->b0:Li8/r;

    .line 59
    .line 60
    iput-object v0, p0, Li8/D;->l:Li8/s;

    .line 61
    .line 62
    iput-object v1, p0, Li8/D;->n:Li8/r;

    .line 63
    .line 64
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "getDefault()"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Li8/D;->o:Ljavax/net/SocketFactory;

    .line 74
    .line 75
    sget-object v0, Li8/E;->D:Ljava/util/List;

    .line 76
    .line 77
    iput-object v0, p0, Li8/D;->r:Ljava/util/List;

    .line 78
    .line 79
    sget-object v0, Li8/E;->C:Ljava/util/List;

    .line 80
    .line 81
    iput-object v0, p0, Li8/D;->s:Ljava/util/List;

    .line 82
    .line 83
    sget-object v0, Lw8/c;->a:Lw8/c;

    .line 84
    .line 85
    iput-object v0, p0, Li8/D;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 86
    .line 87
    sget-object v0, Li8/l;->c:Li8/l;

    .line 88
    .line 89
    iput-object v0, p0, Li8/D;->u:Li8/l;

    .line 90
    .line 91
    const/16 v0, 0x2710

    .line 92
    .line 93
    iput v0, p0, Li8/D;->x:I

    .line 94
    .line 95
    iput v0, p0, Li8/D;->y:I

    .line 96
    .line 97
    iput v0, p0, Li8/D;->z:I

    .line 98
    .line 99
    const-wide/16 v0, 0x400

    .line 100
    .line 101
    iput-wide v0, p0, Li8/D;->A:J

    .line 102
    .line 103
    return-void
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method


# virtual methods
.method public final a(Li8/z;)V
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li8/D;->c:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final b(J)V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-string v1, "unit"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lk8/c;->b(J)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Li8/D;->w:I

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final c()V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-string v1, "unit"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-wide/16 v0, 0x1e

    .line 9
    .line 10
    invoke-static {v0, v1}, Lk8/c;->b(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Li8/D;->x:I

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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

.method public final d(Li8/s;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li8/D;->l:Li8/s;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Li8/D;->B:Li/G;

    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Li8/D;->l:Li8/s;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final e(J)V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-string v1, "unit"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lk8/c;->b(J)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Li8/D;->y:I

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
