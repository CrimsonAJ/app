.class public final synthetic Lj3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj3/l0;


# direct methods
.method public synthetic constructor <init>(Lj3/l0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj3/r;->a:I

    iput-object p1, p0, Lj3/r;->b:Lj3/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lj3/r;->a:I

    .line 2
    .line 3
    check-cast p1, Lj3/p0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 9
    .line 10
    iget-object v0, v0, Lj3/l0;->n:Lj3/m0;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lj3/p0;->A(Lj3/m0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 17
    .line 18
    invoke-static {v0}, Lj3/D;->w0(Lj3/l0;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-interface {p1, v0}, Lj3/p0;->N(Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 27
    .line 28
    iget v0, v0, Lj3/l0;->m:I

    .line 29
    .line 30
    invoke-interface {p1, v0}, Lj3/p0;->a(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 35
    .line 36
    iget v0, v0, Lj3/l0;->e:I

    .line 37
    .line 38
    invoke-interface {p1, v0}, Lj3/p0;->w(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 43
    .line 44
    iget-boolean v1, v0, Lj3/l0;->l:Z

    .line 45
    .line 46
    iget v0, v0, Lj3/l0;->e:I

    .line 47
    .line 48
    invoke-interface {p1, v0, v1}, Lj3/p0;->q(IZ)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 53
    .line 54
    iget-boolean v1, v0, Lj3/l0;->g:Z

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-boolean v0, v0, Lj3/l0;->g:Z

    .line 60
    .line 61
    invoke-interface {p1, v0}, Lj3/p0;->k(Z)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_5
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 66
    .line 67
    iget-object v0, v0, Lj3/l0;->i:Li4/w;

    .line 68
    .line 69
    iget-object v0, v0, Li4/w;->d:Lj3/G0;

    .line 70
    .line 71
    invoke-interface {p1, v0}, Lj3/p0;->v(Lj3/G0;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_6
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 76
    .line 77
    iget-object v0, v0, Lj3/l0;->f:Lj3/m;

    .line 78
    .line 79
    invoke-interface {p1, v0}, Lj3/p0;->G(Lj3/m;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_7
    iget-object v0, p0, Lj3/r;->b:Lj3/l0;

    .line 84
    .line 85
    iget-object v0, v0, Lj3/l0;->f:Lj3/m;

    .line 86
    .line 87
    invoke-interface {p1, v0}, Lj3/p0;->I(Lj3/m;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
