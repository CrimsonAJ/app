.class public final synthetic Ly6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll3/m;Ljava/lang/Object;J)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Ly6/o;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/o;->b:Ljava/lang/Object;

    iput-object p2, p0, Ly6/o;->d:Ljava/lang/Object;

    iput-wide p3, p0, Ly6/o;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Ly6/p;JLjava/lang/String;I)V
    .locals 0

    .line 2
    iput p5, p0, Ly6/o;->a:I

    iput-object p1, p0, Ly6/o;->b:Ljava/lang/Object;

    iput-wide p2, p0, Ly6/o;->c:J

    iput-object p4, p0, Ly6/o;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-wide v0, p0, Ly6/o;->c:J

    .line 2
    .line 3
    iget-object v2, p0, Ly6/o;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, p0, Ly6/o;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget v4, p0, Ly6/o;->a:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Ll3/m;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget v4, Ll4/y;->a:I

    .line 18
    .line 19
    iget-object v3, v3, Ll3/m;->c:Lj3/A;

    .line 20
    .line 21
    iget-object v3, v3, Lj3/A;->a:Lj3/D;

    .line 22
    .line 23
    iget-object v4, v3, Lj3/D;->r:Lk3/e;

    .line 24
    .line 25
    invoke-virtual {v4}, Lk3/e;->S()Lk3/a;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    new-instance v6, Lk3/c;

    .line 30
    .line 31
    invoke-direct {v6, v5, v2, v0, v1}, Lk3/c;-><init>(Lk3/a;Ljava/lang/Object;J)V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x1a

    .line 35
    .line 36
    invoke-virtual {v4, v5, v0, v6}, Lk3/e;->T(Lk3/a;ILl4/i;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v3, Lj3/D;->n0:Ljava/lang/Object;

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    new-instance v1, LX0/k;

    .line 44
    .line 45
    const/16 v2, 0x17

    .line 46
    .line 47
    invoke-direct {v1, v2}, LX0/k;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v3, Lj3/D;->l:Ll4/l;

    .line 51
    .line 52
    invoke-virtual {v2, v0, v1}, Ll4/l;->e(ILl4/i;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void

    .line 56
    :pswitch_0
    check-cast v3, Ly6/p;

    .line 57
    .line 58
    iget-object v3, v3, Ly6/p;->g:Ly6/l;

    .line 59
    .line 60
    iget-object v4, v3, Ly6/l;->n:Ly6/r;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iget-object v4, v4, Ly6/r;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iget-object v3, v3, Ly6/l;->i:LA6/f;

    .line 74
    .line 75
    iget-object v3, v3, LA6/f;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, LA6/d;

    .line 78
    .line 79
    check-cast v2, Ljava/lang/String;

    .line 80
    .line 81
    invoke-interface {v3, v0, v1, v2}, LA6/d;->m(JLjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    return-void

    .line 85
    :pswitch_1
    move-object v5, v3

    .line 86
    check-cast v5, Ly6/p;

    .line 87
    .line 88
    iget-object v0, v5, Ly6/p;->o:Lz6/d;

    .line 89
    .line 90
    iget-object v0, v0, Lz6/d;->b:Lz6/b;

    .line 91
    .line 92
    new-instance v4, Ly6/o;

    .line 93
    .line 94
    iget-wide v6, p0, Ly6/o;->c:J

    .line 95
    .line 96
    move-object v8, v2

    .line 97
    check-cast v8, Ljava/lang/String;

    .line 98
    .line 99
    const/4 v9, 0x1

    .line 100
    invoke-direct/range {v4 .. v9}, Ly6/o;-><init>(Ly6/p;JLjava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v4}, Lz6/b;->a(Ljava/lang/Runnable;)Lf5/q;

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 108
.end method
