.class public interface abstract Lco/notix/push/NotixPush;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/push/NotixPush$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lco/notix/push/NotixPush$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/push/NotixPush$Companion;->$$INSTANCE:Lco/notix/push/NotixPush$Companion;

    sput-object v0, Lco/notix/push/NotixPush;->Companion:Lco/notix/push/NotixPush$Companion;

    return-void
.end method


# virtual methods
.method public abstract addAudience(Ljava/lang/String;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract deleteAudience(Ljava/lang/String;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lco/notix/domain/RequestVars;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract setNotificationModifier(Lco/notix/push/NotixNotificationModifier;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract setTargetEventHandler(Lco/notix/push/NotixTargetEventHandler;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method
