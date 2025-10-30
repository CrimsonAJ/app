.class public final synthetic Lj3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lj3/t;->a:I

    iput p1, p0, Lj3/t;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk3/a;ILj3/q0;Lj3/q0;)V
    .locals 0

    .line 2
    const/4 p1, 0x1

    iput p1, p0, Lj3/t;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lj3/t;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lj3/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lj3/p0;

    .line 7
    .line 8
    iget v0, p0, Lj3/t;->b:I

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lj3/p0;->i(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Lj3/p0;

    .line 15
    .line 16
    iget v0, p0, Lj3/t;->b:I

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lj3/p0;->w(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    check-cast p1, Lk3/j;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget v0, p0, Lj3/t;->b:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    iput-boolean v1, p1, Lk3/j;->u:Z

    .line 33
    .line 34
    :cond_0
    iput v0, p1, Lk3/j;->k:I

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    check-cast p1, Lj3/p0;

    .line 38
    .line 39
    iget v0, p0, Lj3/t;->b:I

    .line 40
    .line 41
    invoke-interface {p1, v0}, Lj3/p0;->i(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
