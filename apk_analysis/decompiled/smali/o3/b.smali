.class public final synthetic Lo3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/i;
.implements Ll4/j;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo3/e;


# direct methods
.method public synthetic constructor <init>(Lo3/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo3/b;->a:I

    iput-object p1, p0, Lo3/b;->b:Lo3/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ll4/f;)V
    .locals 1

    .line 1
    check-cast p1, Lj3/p0;

    .line 2
    .line 3
    iget-object v0, p0, Lo3/b;->b:Lo3/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Lj3/o0;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Lj3/o0;-><init>(Ll4/f;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Lj3/p0;->z(Lj3/o0;)V

    .line 14
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
    .line 33
    .line 34
    .line 35
    .line 36
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
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lo3/b;->a:I

    .line 2
    .line 3
    check-cast p1, Lj3/p0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lo3/b;->b:Lo3/e;

    .line 9
    .line 10
    iget-object v0, v0, Lo3/e;->z:Lj3/b0;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lj3/p0;->B(Lj3/b0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lo3/b;->b:Lo3/e;

    .line 17
    .line 18
    iget-object v0, v0, Lo3/e;->r:Lj3/n0;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Lj3/p0;->d(Lj3/n0;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object v0, p0, Lo3/b;->b:Lo3/e;

    .line 25
    .line 26
    invoke-virtual {v0}, LD/n;->Z()Lj3/Y;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x3

    .line 31
    invoke-interface {p1, v0, v1}, Lj3/p0;->K(Lj3/Y;I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    iget-object v0, p0, Lo3/b;->b:Lo3/e;

    .line 36
    .line 37
    iget-object v0, v0, Lo3/e;->z:Lj3/b0;

    .line 38
    .line 39
    invoke-interface {p1, v0}, Lj3/p0;->B(Lj3/b0;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_3
    iget-object v0, p0, Lo3/b;->b:Lo3/e;

    .line 44
    .line 45
    iget-object v0, v0, Lo3/e;->q:Lj3/G0;

    .line 46
    .line 47
    invoke-interface {p1, v0}, Lj3/p0;->v(Lj3/G0;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_4
    iget-object v0, p0, Lo3/b;->b:Lo3/e;

    .line 52
    .line 53
    invoke-virtual {v0}, LD/n;->Z()Lj3/Y;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-interface {p1, v0, v1}, Lj3/p0;->K(Lj3/Y;I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
