.class public final LD4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA1/g;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LD4/o;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD4/o;->c:Ljava/lang/Object;

    iput-object p2, p0, LD4/o;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Lf5/i;LF5/e;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, LD4/o;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD4/o;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    iput-object p2, p0, LD4/o;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 4

    .line 1
    iget v0, p0, LD4/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, LD4/o;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 13
    .line 14
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->s:Z

    .line 17
    .line 18
    xor-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    const-string v2, "Result has already been consumed."

    .line 21
    .line 22
    invoke-static {v2, v1}, LF4/y;->j(Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->m:Ljava/util/concurrent/CountDownLatch;

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    sget-object v0, Lcom/google/android/gms/common/api/Status;->h:Lcom/google/android/gms/common/api/Status;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->G(Lcom/google/android/gms/common/api/Status;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->f:Lcom/google/android/gms/common/api/Status;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->G(Lcom/google/android/gms/common/api/Status;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->I()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const-string v1, "Result is not ready."

    .line 51
    .line 52
    invoke-static {v1, v0}, LF4/y;->j(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->L()LC4/o;

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LD4/o;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lf5/i;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-virtual {p1, v0}, Lf5/i;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    iget-object v0, p0, LD4/o;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lf5/i;

    .line 70
    .line 71
    invoke-static {p1}, LF4/y;->l(Lcom/google/android/gms/common/api/Status;)LC4/e;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {v0, p1}, Lf5/i;->a(Ljava/lang/Exception;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void

    .line 79
    :pswitch_0
    iget-object p1, p0, LD4/o;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, LA1/g;

    .line 82
    .line 83
    iget-object p1, p1, LA1/g;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Ljava/util/Map;

    .line 86
    .line 87
    iget-object v0, p0, LD4/o;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 88
    .line 89
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 94
    .line 95
    .line 96
.end method
