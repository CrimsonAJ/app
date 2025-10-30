.class public final Lv4/t;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/t;->a:I

    iput-object p2, p0, Lv4/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lv4/t;->b:Ljava/lang/Object;

    .line 3
    .line 4
    iget v2, p0, Lv4/t;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v1, Lv4/c;

    .line 10
    .line 11
    iget-object v2, v1, Lv4/c;->h:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v3, v1, Lv4/c;->k:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 21
    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    iget-wide v3, v1, Lv4/c;->b:J

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    cmp-long v3, v3, v5

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-static {v2}, Ly4/a;->f(Ljava/util/AbstractCollection;)[I

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v4, v1, Lv4/c;->c:Lv4/h;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, LF4/y;->d()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Lv4/h;->w()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    invoke-static {}, Lv4/h;->r()LD4/m;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v5, Lv4/j;

    .line 56
    .line 57
    invoke-direct {v5, v4, v3, v0}, Lv4/j;-><init>(Lv4/h;[II)V

    .line 58
    .line 59
    .line 60
    invoke-static {v5}, Lv4/h;->x(Lv4/s;)V

    .line 61
    .line 62
    .line 63
    move-object v3, v5

    .line 64
    :goto_0
    iput-object v3, v1, Lv4/c;->k:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 65
    .line 66
    new-instance v4, Lv4/w;

    .line 67
    .line 68
    invoke-direct {v4, v1, v0}, Lv4/w;-><init>(Lv4/c;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->K(LC4/p;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->clear()V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    return-void

    .line 78
    :pswitch_0
    check-cast v1, Lv4/u;

    .line 79
    .line 80
    iget-object v0, v1, Lv4/u;->e:Lv4/h;

    .line 81
    .line 82
    iget-object v2, v1, Lv4/u;->a:Ljava/util/HashSet;

    .line 83
    .line 84
    sget-object v3, Lv4/h;->k:Ly4/b;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lv4/h;->v(Ljava/util/HashSet;)V

    .line 87
    .line 88
    .line 89
    iget-wide v1, v1, Lv4/u;->b:J

    .line 90
    .line 91
    iget-object v0, v0, Lv4/h;->b:LT4/d;

    .line 92
    .line 93
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
