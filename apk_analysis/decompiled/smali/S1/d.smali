.class public final LS1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/editProfile/EditProfileFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/editProfile/EditProfileFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, LS1/d;->a:I

    iput-object p1, p0, LS1/d;->b:Lcom/anilab/android/ui/editProfile/EditProfileFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p2, p0, LS1/d;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    iget-object p2, p0, LS1/d;->b:Lcom/anilab/android/ui/editProfile/EditProfileFragment;

    .line 9
    .line 10
    iget-object p2, p2, Lcom/anilab/android/ui/editProfile/EditProfileFragment;->E0:LA7/l;

    .line 11
    .line 12
    invoke-virtual {p2}, LA7/l;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, LS1/a;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, LF0/I;->o(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, LA7/n;->a:LA7/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, LS1/d;->b:Lcom/anilab/android/ui/editProfile/EditProfileFragment;

    .line 33
    .line 34
    invoke-static {p1}, LM1/n;->q0(LM1/n;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 38
    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
