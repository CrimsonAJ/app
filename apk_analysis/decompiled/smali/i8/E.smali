.class public final Li8/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Li8/i;


# static fields
.field public static final C:Ljava/util/List;

.field public static final D:Ljava/util/List;


# instance fields
.field public final A:J

.field public final B:Li/G;

.field public final a:Ll1/g;

.field public final b:Li/G;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lk8/a;

.field public final f:Z

.field public final g:Li8/b;

.field public final h:Z

.field public final i:Z

.field public final j:Li8/r;

.field public final k:Li8/g;

.field public final l:Li8/s;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Li8/r;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljavax/net/ssl/HostnameVerifier;

.field public final u:Li8/l;

.field public final v:Lcom/google/android/gms/internal/measurement/D1;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    new-array v3, v2, [Li8/F;

    .line 5
    .line 6
    sget-object v4, Li8/F;->e:Li8/F;

    .line 7
    .line 8
    aput-object v4, v3, v1

    .line 9
    .line 10
    sget-object v4, Li8/F;->c:Li8/F;

    .line 11
    .line 12
    aput-object v4, v3, v0

    .line 13
    .line 14
    invoke-static {v3}, Lk8/c;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sput-object v3, Li8/E;->C:Ljava/util/List;

    .line 19
    .line 20
    new-array v2, v2, [Li8/p;

    .line 21
    .line 22
    sget-object v3, Li8/p;->e:Li8/p;

    .line 23
    .line 24
    aput-object v3, v2, v1

    .line 25
    .line 26
    sget-object v1, Li8/p;->f:Li8/p;

    .line 27
    .line 28
    aput-object v1, v2, v0

    .line 29
    .line 30
    invoke-static {v2}, Lk8/c;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Li8/E;->D:Ljava/util/List;

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public constructor <init>()V
    .locals 1

    .line 99
    new-instance v0, Li8/D;

    invoke-direct {v0}, Li8/D;-><init>()V

    invoke-direct {p0, v0}, Li8/E;-><init>(Li8/D;)V

    return-void
.end method

.method public constructor <init>(Li8/D;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Li8/D;->a:Ll1/g;

    .line 3
    iput-object v0, p0, Li8/E;->a:Ll1/g;

    .line 4
    iget-object v0, p1, Li8/D;->b:Li/G;

    .line 5
    iput-object v0, p0, Li8/E;->b:Li/G;

    .line 6
    iget-object v0, p1, Li8/D;->c:Ljava/util/ArrayList;

    .line 7
    invoke-static {v0}, Lk8/c;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/E;->c:Ljava/util/List;

    .line 8
    iget-object v0, p1, Li8/D;->d:Ljava/util/ArrayList;

    .line 9
    invoke-static {v0}, Lk8/c;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/E;->d:Ljava/util/List;

    .line 10
    iget-object v0, p1, Li8/D;->e:Lk8/a;

    .line 11
    iput-object v0, p0, Li8/E;->e:Lk8/a;

    .line 12
    iget-boolean v0, p1, Li8/D;->f:Z

    .line 13
    iput-boolean v0, p0, Li8/E;->f:Z

    .line 14
    iget-object v0, p1, Li8/D;->g:Li8/b;

    .line 15
    iput-object v0, p0, Li8/E;->g:Li8/b;

    .line 16
    iget-boolean v0, p1, Li8/D;->h:Z

    .line 17
    iput-boolean v0, p0, Li8/E;->h:Z

    .line 18
    iget-boolean v0, p1, Li8/D;->i:Z

    .line 19
    iput-boolean v0, p0, Li8/E;->i:Z

    .line 20
    iget-object v0, p1, Li8/D;->j:Li8/r;

    .line 21
    iput-object v0, p0, Li8/E;->j:Li8/r;

    .line 22
    iget-object v0, p1, Li8/D;->k:Li8/g;

    .line 23
    iput-object v0, p0, Li8/E;->k:Li8/g;

    .line 24
    iget-object v0, p1, Li8/D;->l:Li8/s;

    .line 25
    iput-object v0, p0, Li8/E;->l:Li8/s;

    .line 26
    iget-object v0, p1, Li8/D;->m:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    .line 27
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    sget-object v0, Lu8/a;->a:Lu8/a;

    .line 28
    :cond_1
    iput-object v0, p0, Li8/E;->m:Ljava/net/ProxySelector;

    .line 29
    iget-object v0, p1, Li8/D;->n:Li8/r;

    .line 30
    iput-object v0, p0, Li8/E;->n:Li8/r;

    .line 31
    iget-object v0, p1, Li8/D;->o:Ljavax/net/SocketFactory;

    .line 32
    iput-object v0, p0, Li8/E;->o:Ljavax/net/SocketFactory;

    .line 33
    iget-object v0, p1, Li8/D;->r:Ljava/util/List;

    .line 34
    iput-object v0, p0, Li8/E;->r:Ljava/util/List;

    .line 35
    iget-object v1, p1, Li8/D;->s:Ljava/util/List;

    .line 36
    iput-object v1, p0, Li8/E;->s:Ljava/util/List;

    .line 37
    iget-object v1, p1, Li8/D;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 38
    iput-object v1, p0, Li8/E;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 39
    iget v1, p1, Li8/D;->w:I

    .line 40
    iput v1, p0, Li8/E;->w:I

    .line 41
    iget v1, p1, Li8/D;->x:I

    .line 42
    iput v1, p0, Li8/E;->x:I

    .line 43
    iget v1, p1, Li8/D;->y:I

    .line 44
    iput v1, p0, Li8/E;->y:I

    .line 45
    iget v1, p1, Li8/D;->z:I

    .line 46
    iput v1, p0, Li8/E;->z:I

    .line 47
    iget-wide v1, p1, Li8/D;->A:J

    .line 48
    iput-wide v1, p0, Li8/E;->A:J

    .line 49
    iget-object v1, p1, Li8/D;->B:Li/G;

    if-nez v1, :cond_2

    .line 50
    new-instance v1, Li/G;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Li/G;-><init>(I)V

    :cond_2
    iput-object v1, p0, Li8/E;->B:Li/G;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    move v3, v2

    goto :goto_0

    :cond_3
    move v3, v1

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_4

    .line 51
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_3

    .line 52
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li8/p;

    .line 53
    iget-boolean v3, v3, Li8/p;->a:Z

    if-eqz v3, :cond_5

    .line 54
    iget-object v0, p1, Li8/D;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_7

    .line 55
    iput-object v0, p0, Li8/E;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 56
    iget-object v0, p1, Li8/D;->v:Lcom/google/android/gms/internal/measurement/D1;

    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    iput-object v0, p0, Li8/E;->v:Lcom/google/android/gms/internal/measurement/D1;

    .line 58
    iget-object v3, p1, Li8/D;->q:Ljavax/net/ssl/X509TrustManager;

    .line 59
    invoke-static {v3}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    iput-object v3, p0, Li8/E;->q:Ljavax/net/ssl/X509TrustManager;

    .line 60
    iget-object p1, p1, Li8/D;->u:Li8/l;

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    iget-object v3, p1, Li8/l;->b:Lcom/google/android/gms/internal/measurement/D1;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_1

    .line 63
    :cond_6
    new-instance v3, Li8/l;

    iget-object p1, p1, Li8/l;->a:Ljava/util/Set;

    invoke-direct {v3, p1, v0}, Li8/l;-><init>(Ljava/util/Set;Lcom/google/android/gms/internal/measurement/D1;)V

    move-object p1, v3

    .line 64
    :goto_1
    iput-object p1, p0, Li8/E;->u:Li8/l;

    goto :goto_4

    .line 65
    :cond_7
    sget-object v0, Ls8/p;->a:Ls8/p;

    .line 66
    sget-object v0, Ls8/p;->a:Ls8/p;

    .line 67
    invoke-virtual {v0}, Ls8/p;->n()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Li8/E;->q:Ljavax/net/ssl/X509TrustManager;

    .line 68
    sget-object v3, Ls8/p;->a:Ls8/p;

    .line 69
    invoke-virtual {v3, v0}, Ls8/p;->m(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    iput-object v3, p0, Li8/E;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 70
    sget-object v3, Ls8/p;->a:Ls8/p;

    .line 71
    invoke-virtual {v3, v0}, Ls8/p;->b(Ljavax/net/ssl/X509TrustManager;)Lcom/google/android/gms/internal/measurement/D1;

    move-result-object v0

    .line 72
    iput-object v0, p0, Li8/E;->v:Lcom/google/android/gms/internal/measurement/D1;

    .line 73
    iget-object p1, p1, Li8/D;->u:Li8/l;

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    iget-object v3, p1, Li8/l;->b:Lcom/google/android/gms/internal/measurement/D1;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_2

    .line 76
    :cond_8
    new-instance v3, Li8/l;

    iget-object p1, p1, Li8/l;->a:Ljava/util/Set;

    invoke-direct {v3, p1, v0}, Li8/l;-><init>(Ljava/util/Set;Lcom/google/android/gms/internal/measurement/D1;)V

    move-object p1, v3

    .line 77
    :goto_2
    iput-object p1, p0, Li8/E;->u:Li8/l;

    goto :goto_4

    .line 78
    :cond_9
    :goto_3
    iput-object v4, p0, Li8/E;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 79
    iput-object v4, p0, Li8/E;->v:Lcom/google/android/gms/internal/measurement/D1;

    .line 80
    iput-object v4, p0, Li8/E;->q:Ljavax/net/ssl/X509TrustManager;

    .line 81
    sget-object p1, Li8/l;->c:Li8/l;

    iput-object p1, p0, Li8/E;->u:Li8/l;

    .line 82
    :goto_4
    iget-object p1, p0, Li8/E;->c:Ljava/util/List;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    .line 83
    iget-object p1, p0, Li8/E;->d:Ljava/util/List;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 84
    iget-object p1, p0, Li8/E;->r:Ljava/util/List;

    if-eqz p1, :cond_a

    move v1, v2

    :cond_a
    iget-object v0, p0, Li8/E;->q:Ljavax/net/ssl/X509TrustManager;

    iget-object v2, p0, Li8/E;->v:Lcom/google/android/gms/internal/measurement/D1;

    iget-object v3, p0, Li8/E;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_5

    .line 85
    :cond_b
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/p;

    .line 86
    iget-boolean v1, v1, Li8/p;->a:Z

    if-eqz v1, :cond_c

    if-eqz v3, :cond_f

    if-eqz v2, :cond_e

    if-eqz v0, :cond_d

    goto :goto_6

    .line 87
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 88
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 90
    :cond_10
    :goto_5
    const-string p1, "Check failed."

    if-nez v3, :cond_14

    if-nez v2, :cond_13

    if-nez v0, :cond_12

    .line 91
    iget-object v0, p0, Li8/E;->u:Li8/l;

    sget-object v1, Li8/l;->c:Li8/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    :goto_6
    return-void

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null network interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 96
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 98
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b()Li8/D;
    .locals 3

    .line 1
    new-instance v0, Li8/D;

    .line 2
    .line 3
    invoke-direct {v0}, Li8/D;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Li8/E;->a:Ll1/g;

    .line 7
    .line 8
    iput-object v1, v0, Li8/D;->a:Ll1/g;

    .line 9
    .line 10
    iget-object v1, p0, Li8/E;->b:Li/G;

    .line 11
    .line 12
    iput-object v1, v0, Li8/D;->b:Li/G;

    .line 13
    .line 14
    iget-object v1, v0, Li8/D;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v2, p0, Li8/E;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v1, v2}, LB7/q;->h0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Li8/D;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v2, p0, Li8/E;->d:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v1, v2}, LB7/q;->h0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Li8/E;->e:Lk8/a;

    .line 29
    .line 30
    iput-object v1, v0, Li8/D;->e:Lk8/a;

    .line 31
    .line 32
    iget-boolean v1, p0, Li8/E;->f:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Li8/D;->f:Z

    .line 35
    .line 36
    iget-object v1, p0, Li8/E;->g:Li8/b;

    .line 37
    .line 38
    iput-object v1, v0, Li8/D;->g:Li8/b;

    .line 39
    .line 40
    iget-boolean v1, p0, Li8/E;->h:Z

    .line 41
    .line 42
    iput-boolean v1, v0, Li8/D;->h:Z

    .line 43
    .line 44
    iget-boolean v1, p0, Li8/E;->i:Z

    .line 45
    .line 46
    iput-boolean v1, v0, Li8/D;->i:Z

    .line 47
    .line 48
    iget-object v1, p0, Li8/E;->j:Li8/r;

    .line 49
    .line 50
    iput-object v1, v0, Li8/D;->j:Li8/r;

    .line 51
    .line 52
    iget-object v1, p0, Li8/E;->k:Li8/g;

    .line 53
    .line 54
    iput-object v1, v0, Li8/D;->k:Li8/g;

    .line 55
    .line 56
    iget-object v1, p0, Li8/E;->l:Li8/s;

    .line 57
    .line 58
    iput-object v1, v0, Li8/D;->l:Li8/s;

    .line 59
    .line 60
    iget-object v1, p0, Li8/E;->m:Ljava/net/ProxySelector;

    .line 61
    .line 62
    iput-object v1, v0, Li8/D;->m:Ljava/net/ProxySelector;

    .line 63
    .line 64
    iget-object v1, p0, Li8/E;->n:Li8/r;

    .line 65
    .line 66
    iput-object v1, v0, Li8/D;->n:Li8/r;

    .line 67
    .line 68
    iget-object v1, p0, Li8/E;->o:Ljavax/net/SocketFactory;

    .line 69
    .line 70
    iput-object v1, v0, Li8/D;->o:Ljavax/net/SocketFactory;

    .line 71
    .line 72
    iget-object v1, p0, Li8/E;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 73
    .line 74
    iput-object v1, v0, Li8/D;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 75
    .line 76
    iget-object v1, p0, Li8/E;->q:Ljavax/net/ssl/X509TrustManager;

    .line 77
    .line 78
    iput-object v1, v0, Li8/D;->q:Ljavax/net/ssl/X509TrustManager;

    .line 79
    .line 80
    iget-object v1, p0, Li8/E;->r:Ljava/util/List;

    .line 81
    .line 82
    iput-object v1, v0, Li8/D;->r:Ljava/util/List;

    .line 83
    .line 84
    iget-object v1, p0, Li8/E;->s:Ljava/util/List;

    .line 85
    .line 86
    iput-object v1, v0, Li8/D;->s:Ljava/util/List;

    .line 87
    .line 88
    iget-object v1, p0, Li8/E;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 89
    .line 90
    iput-object v1, v0, Li8/D;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 91
    .line 92
    iget-object v1, p0, Li8/E;->u:Li8/l;

    .line 93
    .line 94
    iput-object v1, v0, Li8/D;->u:Li8/l;

    .line 95
    .line 96
    iget-object v1, p0, Li8/E;->v:Lcom/google/android/gms/internal/measurement/D1;

    .line 97
    .line 98
    iput-object v1, v0, Li8/D;->v:Lcom/google/android/gms/internal/measurement/D1;

    .line 99
    .line 100
    iget v1, p0, Li8/E;->w:I

    .line 101
    .line 102
    iput v1, v0, Li8/D;->w:I

    .line 103
    .line 104
    iget v1, p0, Li8/E;->x:I

    .line 105
    .line 106
    iput v1, v0, Li8/D;->x:I

    .line 107
    .line 108
    iget v1, p0, Li8/E;->y:I

    .line 109
    .line 110
    iput v1, v0, Li8/D;->y:I

    .line 111
    .line 112
    iget v1, p0, Li8/E;->z:I

    .line 113
    .line 114
    iput v1, v0, Li8/D;->z:I

    .line 115
    .line 116
    iget-wide v1, p0, Li8/E;->A:J

    .line 117
    .line 118
    iput-wide v1, v0, Li8/D;->A:J

    .line 119
    .line 120
    iget-object v1, p0, Li8/E;->B:Li/G;

    .line 121
    .line 122
    iput-object v1, v0, Li8/D;->B:Li/G;

    .line 123
    .line 124
    return-object v0
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final c(Li8/G;)Ln8/g;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ln8/g;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Ln8/g;-><init>(Li8/E;Li8/G;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method
