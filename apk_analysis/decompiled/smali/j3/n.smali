.class public final synthetic Lj3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO5/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj3/n;->a:I

    iput-object p1, p0, Lj3/n;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lj3/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj3/n;->b:Landroid/content/Context;

    .line 7
    .line 8
    sget-object v1, Lk4/s;->n:LP5/S;

    .line 9
    .line 10
    const-class v1, Lk4/s;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    sget-object v2, Lk4/s;->t:Lk4/s;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, LC3/c;

    .line 18
    .line 19
    invoke-direct {v2, v0}, LC3/c;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lk4/s;

    .line 23
    .line 24
    iget-object v0, v2, LC3/c;->d:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, v0

    .line 27
    check-cast v5, Ljava/util/HashMap;

    .line 28
    .line 29
    iget-object v0, v2, LC3/c;->e:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v7, v0

    .line 32
    check-cast v7, Ll4/u;

    .line 33
    .line 34
    iget-boolean v8, v2, LC3/c;->b:Z

    .line 35
    .line 36
    iget-object v0, v2, LC3/c;->c:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v4, v0

    .line 39
    check-cast v4, Landroid/content/Context;

    .line 40
    .line 41
    iget v6, v2, LC3/c;->a:I

    .line 42
    .line 43
    invoke-direct/range {v3 .. v8}, Lk4/s;-><init>(Landroid/content/Context;Ljava/util/HashMap;ILl4/u;Z)V

    .line 44
    .line 45
    .line 46
    sput-object v3, Lk4/s;->t:Lk4/s;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :goto_0
    sget-object v0, Lk4/s;->t:Lk4/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    monitor-exit v1

    .line 54
    return-object v0

    .line 55
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0

    .line 57
    :pswitch_0
    new-instance v0, Li4/o;

    .line 58
    .line 59
    iget-object v1, p0, Lj3/n;->b:Landroid/content/Context;

    .line 60
    .line 61
    invoke-direct {v0, v1}, Li4/o;-><init>(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_1
    new-instance v0, LN3/m;

    .line 66
    .line 67
    new-instance v1, Lq3/h;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v2, LO0/c;

    .line 73
    .line 74
    iget-object v3, p0, Lj3/n;->b:Landroid/content/Context;

    .line 75
    .line 76
    const/16 v4, 0x1d

    .line 77
    .line 78
    invoke-direct {v2, v3, v4}, LO0/c;-><init>(Landroid/content/Context;I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v2, v1}, LN3/m;-><init>(Lk4/l;Lq3/h;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_2
    new-instance v0, Lj3/k;

    .line 86
    .line 87
    iget-object v1, p0, Lj3/n;->b:Landroid/content/Context;

    .line 88
    .line 89
    invoke-direct {v0, v1}, Lj3/k;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
